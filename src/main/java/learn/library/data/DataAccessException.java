package learn.library.data;

public class DataAccessException extends RuntimeException {
  public DataAccessException(String message, Throwable rootCause) {
    super(message, rootCause);
  }
}
