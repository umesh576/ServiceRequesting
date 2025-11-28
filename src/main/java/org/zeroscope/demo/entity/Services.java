package org.zeroscope.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Services")
public class Services {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "Service_name", nullable = false)
  private String serviceName;

  @Column(name = "ServiceDecription", nullable = false)
  private String ServiceDecription;

  @Column(name = "ServiceImage")
  private String ServiceImage;

  public Services() {}

  public Services(
    String serviceName,
    String ServiceDecription,
    String ServiceImage
  ) {
    this.serviceName = serviceName;
    this.ServiceDecription = ServiceDecription;
    this.ServiceImage = ServiceImage;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getServiceName() {
    return serviceName;
  }

  public String getServiceDescription() {
    return ServiceDecription;
  }

  public void setServiceName(String ServiceName) {
    this.serviceName = ServiceName;
  }

  @Override
  public String toString() {
    return (
      "Service Name:{ " +
      serviceName +
      "} " +
      "Service Decription" +
      ServiceDecription +
      "} "
    );
  }
}
