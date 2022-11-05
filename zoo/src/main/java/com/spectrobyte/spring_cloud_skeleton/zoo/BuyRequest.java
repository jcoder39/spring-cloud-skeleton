package com.spectrobyte.spring_cloud_skeleton.zoo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class BuyRequest
{
  @NotNull
  private String firstName;

  @NotNull
  private String lastName;
}
