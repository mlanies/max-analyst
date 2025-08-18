package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r41 implements b64 {
    public static final r41 a = new r41();
    public static final s41 b = s41.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        int i;
        if (!b.a.contains(e64Var)) {
            return null;
        }
        s41.b.getClass();
        if (e64Var.equals(s41.d)) {
            String strC = c37.C(i24.F("link", bundle));
            boolean zX = f46.X(i24.u("video_enabled", bundle));
            boolean zX2 = f46.X(i24.u("microphone_enabled", bundle));
            Boolean boolU = i24.u("front_camera_enabled", bundle);
            return new l64(str, e64Var, bundle, 0, new j64(new q41(2, 0), new q41(2, 1)), new l41(strC, zX, zX2, boolU != null ? boolU.booleanValue() : true, f46.X(i24.u("is_new", bundle))), 8);
        }
        if (e64Var.equals(s41.c)) {
            long jD = i24.D("opponent_id", bundle);
            boolean zX3 = f46.X(i24.u("video_enabled", bundle));
            Boolean boolU2 = i24.u("microphone_enabled", bundle);
            return new l64(str, e64Var, bundle, 0, new j64(new q41(2, 0), new q41(2, 1)), new m41(jD, zX3, boolU2 != null ? boolU2.booleanValue() : true, 0), 8);
        }
        if (e64Var.equals(s41.e)) {
            return new l64(str, e64Var, bundle, 0, new j64(new q41(2, 0), new q41(2, 1)), new m41(i24.D("chat_id", bundle), f46.X(i24.u("video_enabled", bundle)), f46.X(i24.u("microphone_enabled", bundle)), 1), 8);
        }
        if (e64Var.equals(s41.g)) {
            String string = bundle.getString("place");
            String str2 = true ^ (string == null || w9e.C0(string)) ? string : null;
            if (str2 == null) {
                str2 = "OTHER";
            }
            if (str2 == null) {
                throw new NullPointerException("Name is null");
            }
            if (str2.equals("PIP")) {
                i = 1;
            } else if (str2.equals("FIRST")) {
                i = 2;
            } else {
                if (!str2.equals("OTHER")) {
                    throw new IllegalArgumentException("No enum constant one.me.calls.ui.deeplink.CallDeepLinkFactory.Place.".concat(str2));
                }
                i = 3;
            }
            return new l64(str, e64Var, bundle, 0, new j64(new q41(i, 0), new q41(i, 1)), new n41(), 8);
        }
        if (e64Var.equals(s41.k)) {
            return new l64(str, e64Var, bundle, 0, new j64(new k11(6), new k11(7)), new i(2), 8);
        }
        if (e64Var.equals(s41.f)) {
            return new l64(str, e64Var, bundle, 0, new j64(new q41(3, 0), new q41(3, 1)), new o41(i24.D("chat_id", bundle), i24.F("call_name", bundle), bundle.getString("call_avatar"), i24.A("video_enabled", bundle)), 8);
        }
        if (e64Var.equals(s41.h)) {
            return new l64(str, e64Var, bundle, 0, null, new k41(c37.C(i24.F("link", bundle)), 0), 24);
        }
        if (e64Var.equals(s41.i)) {
            return new l64(str, e64Var, bundle, 0, null, new i(3), 24);
        }
        if (e64Var.equals(s41.j)) {
            return new l64(str, e64Var, bundle, 0, null, new i(4), 24);
        }
        if (e64Var.equals(s41.m)) {
            return new l64(str, e64Var, bundle, 0, new j64(new q41(3, 0), new q41(3, 1)), new p41(bundle), 8);
        }
        if (e64Var.equals(s41.l)) {
            return new l64(str, e64Var, bundle, 0, null, new i(5), 24);
        }
        throw new IllegalStateException(au1.f("invalid route ", e64Var));
    }
}
