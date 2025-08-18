package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.buffer.ArrayBufferInput;

/* loaded from: classes2.dex */
public abstract class vw8 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final tw8 b;
    public static final uw8 c;

    static {
        tw8 tw8Var = new tw8();
        tw8Var.a = 512;
        tw8Var.b = 8192;
        tw8Var.c = 8192;
        tw8Var.o = true;
        b = tw8Var;
        uw8 uw8Var = new uw8();
        uw8Var.a = true;
        uw8Var.b = true;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        uw8Var.c = codingErrorAction;
        uw8Var.o = codingErrorAction;
        uw8Var.X = Integer.MAX_VALUE;
        uw8Var.Y = 8192;
        uw8Var.Z = 8192;
        c = uw8Var;
    }

    public static gy8 a(byte[] bArr) {
        uw8 uw8Var = c;
        uw8Var.getClass();
        return new gy8(new ArrayBufferInput(bArr), uw8Var);
    }
}
