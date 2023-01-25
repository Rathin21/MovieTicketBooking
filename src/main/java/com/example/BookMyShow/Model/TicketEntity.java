package com.example.BookMyShow.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EntityListeners(value = {AuditingEntityListener.class})
@Table(name="tickets")
public class TicketEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "alloted_seats", nullable = false)
    private String allotedSeat;

    @Column(name = "amount", nullable = false)
    private double amount;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "booked_at", nullable = false)
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private UserEntity user;

    @ManyToOne
    @JsonIgnore
    @JoinColumn
    private ShowEntity show;

    @OneToMany(mappedBy = "show" ,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowSeatsEntity> seats;
}
