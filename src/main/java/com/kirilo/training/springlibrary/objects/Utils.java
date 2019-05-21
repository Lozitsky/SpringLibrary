package com.kirilo.training.springlibrary.objects;

import com.kirilo.training.springlibrary.enums.SearchType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.faces.context.FacesContext;
import java.util.HashMap;
import java.util.Map;

@Component
public class Utils {
    private Map<String, SearchType> searchTypeMap = new HashMap<String, SearchType>();
    private SearchType selectedSearchType = SearchType.TITLE;

    @Autowired
    private MessageSource msg;

    private Character[] letters = new Character[]{'A', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

    public Character[] getLetters() {
        return letters;
    }

    public Map<String, SearchType> getSearchTypeMap() {
        searchTypeMap.clear();
        searchTypeMap.put(msg.getMessage("author_name", null, FacesContext.getCurrentInstance().getViewRoot().getLocale()), SearchType.AUTHOR);
        searchTypeMap.put(msg.getMessage("book_name", null, FacesContext.getCurrentInstance().getViewRoot().getLocale()), SearchType.TITLE);
        return searchTypeMap;
    }

    public SearchType getSelectedSearchType() {
        return selectedSearchType;
    }

    public void setSearchTypeMap(Map<String, SearchType> searchTypeMap) {
        this.searchTypeMap = searchTypeMap;
    }
}
