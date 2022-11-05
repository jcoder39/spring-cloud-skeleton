package com.spectrobyte.spring_cloud_skeleton.zoo;

import com.spectrobyte.spring_cloud_skeleton.common.http.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/zoo/tickets")
@RequiredArgsConstructor
public class TicketsController
{
  private final Validator validator;

  @PostMapping("/buy")
  public Message Buy(@RequestBody BuyRequest buyRequest)
  {
    var errors = validate(buyRequest);
    if(!errors.isEmpty()) {
      return Message.New().Status(666).Add("errors", errors);
    }

    return Message.New().Add("ticketId", UUID.randomUUID().toString());
  }

  private <T> List<String> validate(T request)
  {
    Set<ConstraintViolation<T>> violations = validator.validate(request);
    return violations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
  }
}
