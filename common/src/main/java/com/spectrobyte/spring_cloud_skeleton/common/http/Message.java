package com.spectrobyte.spring_cloud_skeleton.common.http;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Message
{
  @JsonProperty
  private int status;
  @JsonProperty
  private Map<String, Object> data;

  private Message()
  {
    status = 0;
    data = new HashMap<>();
  }

  public static Message New()
  {
    return new Message();
  }

  public int GetStatus()
  {
    return status;
  }

  public <T> Optional<T> Get(String key)
  {
    return Optional.ofNullable((T) data.getOrDefault(key, null));
  }

  public Message Add(String key, Object object)
  {
    data.put(key, object);
    return this;
  }

  public Message Status(int status)
  {
    this.status = status;
    return this;
  }

  public Message Clear()
  {
    data.clear();
    return this;
  }
}
