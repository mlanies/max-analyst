package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Map;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class y37 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Object b;

    static {
        Charset.forName("ISO-8859-1");
        b = new Object();
    }

    public static int a(Map map, int i, int i2, int i3) {
        int iM = y43.m(i);
        int iJ = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int iD = y43.d(2, i3, value) + y43.d(1, i2, key);
            iJ += y43.j(iD) + iM + iD;
        }
        return iJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [qw8] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Serializable] */
    public static final Map b(x43 x43Var, Map map, py7 py7Var, int i, int i2, qw8 qw8Var, int i3, int i4) throws InvalidProtocolBufferNanoException {
        Map mapA = py7Var.a(map);
        int iE = x43Var.e(x43Var.p());
        Serializable serializableC = null;
        while (true) {
            int iS = x43Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == i3) {
                serializableC = x43Var.k(i);
            } else if (iS == i4) {
                if (i2 == 11) {
                    x43Var.j(qw8Var);
                } else {
                    qw8Var = x43Var.k(i2);
                }
            } else if (!x43Var.u(iS)) {
                break;
            }
        }
        x43Var.a(0);
        x43Var.d(iE);
        if (serializableC == null) {
            serializableC = c(i);
        }
        if (qw8Var == 0) {
            qw8Var = c(i2);
        }
        mapA.put(serializableC, qw8Var);
        return mapA;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [byte[], java.io.Serializable] */
    public static Serializable c(int i) {
        switch (i) {
            case 1:
                return Double.valueOf(0.0d);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
            case LangUtils.HASH_SEED /* 17 */:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException(wg0.g(i, "Type: ", " is not a primitive type."));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return nd7.g;
        }
    }

    public static void d(y43 y43Var, Map map, int i, int i2, int i3) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int iD = y43.d(2, i3, value) + y43.d(1, i2, key);
            y43Var.F(i, 2);
            y43Var.C(iD);
            y43Var.u(1, i2, key);
            y43Var.u(2, i3, value);
        }
    }
}
