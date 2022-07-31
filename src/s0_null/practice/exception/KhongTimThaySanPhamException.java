package s0_null.practice.exception;

import java.io.IOException;

public class KhongTimThaySanPhamException extends IOException {
    public KhongTimThaySanPhamException(String message) {
        super(message);
    }
}
