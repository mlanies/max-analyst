package defpackage;

import java.util.HashMap;
import java.util.List;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class ju3 extends bz {
    public final fs8 A0;
    public final String B0;
    public final Long X;
    public final List Y;
    public final String Z;
    public final int o;
    public final String s0;
    public final String t0;
    public final String u0;
    public final a20 v0;
    public final String w0;
    public final String x0;
    public final boolean y0;
    public final int z0;

    public ju3(int i, Long l, List list, String str, String str2, String str3, String str4, a20 a20Var, String str5, String str6, boolean z, int i2, fs8 fs8Var, String str7, boolean z2, boolean z3) {
        super(b10.CONTROL, z2, z3);
        this.o = i;
        this.X = l;
        this.Y = list;
        this.Z = str;
        this.s0 = str2;
        this.t0 = str3;
        this.u0 = str4;
        this.v0 = a20Var;
        this.w0 = str5;
        this.x0 = str6;
        this.y0 = z;
        this.z0 = i2;
        this.A0 = fs8Var;
        this.B0 = str7;
    }

    @Override // defpackage.bz
    public final HashMap a() {
        String str;
        String str2;
        HashMap mapA = super.a();
        int i = this.o;
        switch (i) {
            case 1:
                str = "unknown";
                break;
            case 2:
                str = "new";
                break;
            case 3:
                str = "add";
                break;
            case 4:
                str = "remove";
                break;
            case 5:
                str = "leave";
                break;
            case 6:
                str = "title";
                break;
            case 7:
                str = "icon";
                break;
            case 8:
                str = "hello";
                break;
            case 9:
                str = "system";
                break;
            case 10:
                str = "joinByLink";
                break;
            case 11:
                str = "pin";
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                str = "botStarted";
                break;
            default:
                throw null;
        }
        mapA.put("event", str);
        List list = this.Y;
        if (list != null && list.size() > 0) {
            mapA.put("userIds", list);
        }
        Long l = this.X;
        if (l != null && l.longValue() != 0) {
            mapA.put("userId", l);
        }
        String str3 = this.Z;
        if (str3 != null) {
            mapA.put("title", str3);
        }
        String str4 = this.s0;
        if (str4 != null) {
            mapA.put("photoToken", str4);
        }
        a20 a20Var = this.v0;
        if (a20Var != null) {
            mapA.put("crop", a20Var.a());
        }
        if (i == 3) {
            mapA.put("showHistory", Boolean.valueOf(this.y0));
        }
        if (i == 2) {
            int i2 = this.z0;
            if (i2 == 1) {
                str2 = "UNKNOWN";
            } else if (i2 == 2) {
                str2 = "DIALOG";
            } else if (i2 == 3) {
                str2 = "CHAT";
            } else if (i2 == 4) {
                str2 = "CHANNEL";
            } else {
                if (i2 != 5) {
                    throw null;
                }
                str2 = "GROUP_CHAT";
            }
            mapA.put("chatType", str2);
        }
        String str5 = this.B0;
        if (!oag.t(str5)) {
            mapA.put("startPayload", str5);
        }
        return mapA;
    }
}
