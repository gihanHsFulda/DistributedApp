//author - Gihan Kaushal
//date - 2023-11-05
//Matriculation number - 1455441

package com.bmicalculator.bmi;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicResponse {

    private int resultCount;
    private List<MusicTrack> result;

    public MusicResponse() {
    }

    @Getter
    @Setter
    static class MusicTrack {
        private String wrapperType;
        private String kind;
        private long artistId;
        private long collectionId;
        private long trackId;
        private String artistName;
        private String collectionName;
        private String trackName;
        private String collectionCensoredName;
        private String trackCensoredName;
        private String artistViewUrl;
        private String collectionViewUrl;
        private String trackViewUrl;
        private String previewUrl;
        private String artworkUrl30;
        private String artworkUrl60;
        private String artworkUrl100;
        private double collectionPrice;
        private double trackPrice;
        private Date releaseDate;
        private String collectionExplicitness;
        private String trackExplicitness;
        private int discCount;
        private int discNumber;
        private int trackCount;
        private int trackNumber;
        private long trackTimeMillis;
        private String country;
        private String currency;
        private String primaryGenreName;
        private String contentAdvisoryRating;
        private boolean isStreamable;
    }

}
