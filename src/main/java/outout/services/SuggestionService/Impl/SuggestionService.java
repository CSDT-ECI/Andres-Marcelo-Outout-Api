package outout.services.SuggestionService.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import outout.repository.SuggestionRepository.ISuggestionRepository;
import outout.services.SuggestionService.ISuggestionService;

@Component("suggestionService")
public class SuggestionService implements ISuggestionService {

    @Autowired
    private ISuggestionRepository suggestionRepository;

    @Override
    public void suggestRestaurant() {

    }

    @Override
    public void getSuggestionsForToday() {

    }
}
