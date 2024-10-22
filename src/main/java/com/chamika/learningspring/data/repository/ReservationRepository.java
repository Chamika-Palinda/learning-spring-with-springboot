package com.chamika.learningspring.data.repository;

import com.chamika.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
