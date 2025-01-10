package smhrd.model;

import java.time.LocalDate;

public class MusicalDetailVO {
    private int showIdx;          // 공연 ID
    private String musicalId;     // 뮤지컬 ID
    private String musicalTitle;  // 뮤지컬 제목
    private String musicalPoster; // 포스터 URL
    private LocalDate musicalStDt;  // 상연 시작일
    private LocalDate musicalEdDt;  // 상연 종료일
    private String hallName;      // 공연장 이름
    private String showDate;      // 상영일
    private String showRuntime;   // 런타임
    private String showPrice;     // 가격
    private String showImg;       // 공연 이미지
    private int showViews;        // 조회수

    // 기본 생성자
    public MusicalDetailVO() {}

    // 매개변수가 있는 생성자
    public MusicalDetailVO(int showIdx, String musicalId, String musicalTitle, String musicalPoster,
                           LocalDate musicalStDt, LocalDate musicalEdDt, String hallName,
                           String showDate, String showRuntime, String showPrice,
                           String showImg, int showViews) {
        this.showIdx = showIdx;
        this.musicalId = musicalId;
        this.musicalTitle = musicalTitle;
        this.musicalPoster = musicalPoster;
        this.musicalStDt = musicalStDt;
        this.musicalEdDt = musicalEdDt;
        this.hallName = hallName;
        this.showDate = showDate;
        this.showRuntime = showRuntime;
        this.showPrice = showPrice;
        this.showImg = showImg;
        this.showViews = showViews;
    }

    // Getter & Setter
    public int getShowIdx() {
        return showIdx;
    }

    public void setShowIdx(int showIdx) {
        this.showIdx = showIdx;
    }

    public String getMusicalId() {
        return musicalId;
    }

    public void setMusicalId(String musicalId) {
        this.musicalId = musicalId;
    }

    public String getMusicalTitle() {
        return musicalTitle;
    }

    public void setMusicalTitle(String musicalTitle) {
        this.musicalTitle = musicalTitle;
    }

    public String getMusicalPoster() {
        return musicalPoster;
    }

    public void setMusicalPoster(String musicalPoster) {
        this.musicalPoster = musicalPoster;
    }

    public LocalDate getMusicalStDt() {
        return musicalStDt;
    }

    public void setMusicalStDt(LocalDate musicalStDt) {
        this.musicalStDt = musicalStDt;
    }

    public LocalDate getMusicalEdDt() {
        return musicalEdDt;
    }

    public void setMusicalEdDt(LocalDate musicalEdDt) {
        this.musicalEdDt = musicalEdDt;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getShowRuntime() {
        return showRuntime;
    }

    public void setShowRuntime(String showRuntime) {
        this.showRuntime = showRuntime;
    }

    public String getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(String showPrice) {
        this.showPrice = showPrice;
    }

    public String getShowImg() {
        return showImg;
    }

    public void setShowImg(String showImg) {
        this.showImg = showImg;
    }

    public int getShowViews() {
        return showViews;
    }

    public void setShowViews(int showViews) {
        this.showViews = showViews;
    }

    // toString 메서드
    @Override
    public String toString() {
        return "MusicalDetailVO{" +
                "showIdx=" + showIdx +
                ", musicalId='" + musicalId + '\'' +
                ", musicalTitle='" + musicalTitle + '\'' +
                ", musicalPoster='" + musicalPoster + '\'' +
                ", musicalStDt=" + musicalStDt +
                ", musicalEdDt=" + musicalEdDt +
                ", hallName='" + hallName + '\'' +
                ", showDate='" + showDate + '\'' +
                ", showRuntime='" + showRuntime + '\'' +
                ", showPrice='" + showPrice + '\'' +
                ", showImg='" + showImg + '\'' +
                ", showViews=" + showViews +
                '}';
    }
}
