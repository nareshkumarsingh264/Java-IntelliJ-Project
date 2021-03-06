import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

    public List<Book> findBybookName (String name);
}
