package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class lf7 extends i64 {
    public static final lf7 b;
    public static final e64 c;
    public static final e64 d;
    public static final e64 e;

    static {
        lf7 lf7Var = new lf7();
        b = lf7Var;
        c = i64.a(lf7Var, ":location/show", new String[]{"lat", "lon"}, null, 0, 14);
        d = i64.a(lf7Var, ":location/pick", new String[]{"request_code"}, null, 0, 14);
        e = i64.a(lf7Var, ":attach/fullscreen", new String[]{"attachment_id"}, Collections.singleton("message"), 0, 12);
    }
}
