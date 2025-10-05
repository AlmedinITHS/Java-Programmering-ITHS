package EnklaOvningarFranSlide;

public enum HTTPStatus {
    OK (200),
    NOT_FOUND(404),
    FORBIDDEN (403),
    INTERNAL_SERVER_ERROR(500);

    private final int code;

    private HTTPStatus (int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    
}
