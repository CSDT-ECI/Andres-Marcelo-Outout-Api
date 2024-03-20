package outout.repository.SuggestionRepository;

import org.springframework.stereotype.Component;
import outout.model.Suggestion;

import java.util.Date;
import java.util.List;

public interface ISuggestionRepository {

    public void createSuggestion(Suggestion suggestion);

    public List<Suggestion> GetSuggestionsByRestaurantAndDate(String restaurant, Date date);

    public List<Suggestion> GetSuggestionsByUserAndDate(String username, Date date);


    public List<Suggestion> getSuggestionsByDate(Date date);
}
