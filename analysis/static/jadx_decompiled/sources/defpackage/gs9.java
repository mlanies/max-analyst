package defpackage;

import java.util.HashMap;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class gs9 extends dle {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs9(sla slaVar, int i) {
        super(slaVar);
        this.o = i;
    }

    @Override // defpackage.dle
    public short N() {
        switch (this.o) {
            case 1:
                yb9 yb9Var = sla.c;
                return (short) 80;
            case 2:
                yb9 yb9Var2 = sla.c;
                return (short) 1;
            case 3:
                yb9 yb9Var3 = sla.c;
                return (short) 16;
            case 4:
                yb9 yb9Var4 = sla.c;
                return (short) 60;
            case 5:
                yb9 yb9Var5 = sla.c;
                return (short) 43;
            case 6:
            case 7:
            case 13:
            default:
                return super.N();
            case 8:
                yb9 yb9Var6 = sla.c;
                return (short) 97;
            case 9:
                yb9 yb9Var7 = sla.c;
                return (short) 96;
            case 10:
                yb9 yb9Var8 = sla.c;
                return (short) 193;
            case 11:
                yb9 yb9Var9 = sla.c;
                return (short) 81;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yb9 yb9Var10 = sla.c;
                return (short) 119;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yb9 yb9Var11 = sla.c;
                return (short) 79;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yb9 yb9Var12 = sla.c;
                return (short) 83;
            case 16:
                yb9 yb9Var13 = sla.c;
                return (short) 82;
        }
    }

    @Override // defpackage.dle
    public int O() {
        switch (this.o) {
            case 2:
                return 0;
            default:
                return super.O();
        }
    }

    @Override // defpackage.dle
    public boolean w() {
        switch (this.o) {
            case 2:
                return true;
            default:
                return super.w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs9(int i, int i2) {
        super((sla) null);
        this.o = 16;
        e(au1.s(i), "type");
        e(i2, NewHtcHomeBadger.COUNT);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs9(int i, long j, a20 a20Var, String str, String str2, String str3, String str4, String str5) {
        super((sla) null);
        this.o = 3;
        if (str != null) {
            p("firstName", str);
        }
        if (str2 != null) {
            p("lastName", str2);
        }
        if (str3 != null) {
            p("photoToken", str3);
        }
        if (j != 0) {
            i(j, "photoId");
        }
        if (a20Var != null) {
            n("crop", a20Var.a());
        }
        if (!oag.t(str4)) {
            p("description", str4.equals("$REMOVE$") ? "" : str4);
        }
        if (!oag.t(str5)) {
            p("link", str5.equals("$REMOVE$") ? "" : str5);
        }
        p("avatarType", au1.e(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs9(long j) {
        super((sla) null);
        this.o = 5;
        if (j != 0) {
            i(j, "photoId");
            return;
        }
        throw new IllegalArgumentException("photoId must not be 0");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs9(Boolean bool) {
        super((sla) null);
        this.o = 1;
        e(1, NewHtcHomeBadger.COUNT);
        ((HashMap) this.b).put("profile", bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs9(String str, long j, long j2, long j3) {
        super((sla) null);
        this.o = 15;
        i(j, "videoId");
        if (j2 != 0) {
            i(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j3 > 0) {
            i(j3, "messageId");
        }
        if (oag.t(str)) {
            return;
        }
        p(ApiProtocol.KEY_TOKEN, str);
    }
}
