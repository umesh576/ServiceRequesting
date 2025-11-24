package org.zeroscope.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Services")
public class Services {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "ServiceName", nullable = false)
  private String ServiceName;

  @Column(name = "ServiceDecription", nullable = false)
  private String ServiceDecription;

  @Column(name = "ServiceImage")
  private String ServiceImage;

  public Services() {}

  public Services(
    String ServiceName,
    String ServiceDecription,
    String ServiceImage
  ) {
    this.ServiceName = ServiceName;
    this.ServiceDecription = ServiceDecription;
    this.ServiceImage = ServiceImage;
  }
}
