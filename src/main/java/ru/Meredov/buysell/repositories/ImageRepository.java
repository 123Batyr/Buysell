package ru.Meredov.buysell.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.Meredov.buysell.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
