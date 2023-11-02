package bookmanagementsystem.repository;

import bookmanagementsystem.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
