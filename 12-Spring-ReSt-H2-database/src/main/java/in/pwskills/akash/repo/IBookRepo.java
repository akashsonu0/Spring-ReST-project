package in.pwskills.akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.akash.model.Book;

public interface IBookRepo extends JpaRepository<Book, Integer> {

}
