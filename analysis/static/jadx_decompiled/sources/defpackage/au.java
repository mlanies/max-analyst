package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class au extends dle {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(sla slaVar, int i) {
        super(slaVar);
        this.o = i;
    }

    @Override // defpackage.dle
    public short N() {
        switch (this.o) {
            case 0:
                yb9 yb9Var = sla.c;
                return (short) 29;
            case 1:
                yb9 yb9Var2 = sla.c;
                return (short) 28;
            case 2:
                yb9 yb9Var3 = sla.c;
                return (short) 26;
            case 3:
                yb9 yb9Var4 = sla.c;
                return (short) 261;
            case 4:
                yb9 yb9Var5 = sla.c;
                return (short) 260;
            case 5:
                yb9 yb9Var6 = sla.c;
                return (short) 259;
            case 6:
                yb9 yb9Var7 = sla.c;
                return (short) 27;
            case 7:
            case 8:
            case 9:
            case 11:
            case 13:
            case 20:
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
            case 25:
            default:
                return super.N();
            case 10:
                yb9 yb9Var8 = sla.c;
                return (short) 76;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return sla.a2.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yb9 yb9Var9 = sla.c;
                return (short) 54;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yb9 yb9Var10 = sla.c;
                return (short) 61;
            case 16:
                yb9 yb9Var11 = sla.c;
                return (short) 117;
            case LangUtils.HASH_SEED /* 17 */:
                yb9 yb9Var12 = sla.c;
                return (short) 63;
            case 18:
                yb9 yb9Var13 = sla.c;
                return (short) 52;
            case 19:
                return sla.j2.a;
            case 21:
                yb9 yb9Var14 = sla.c;
                return (short) 48;
            case 22:
                yb9 yb9Var15 = sla.c;
                return (short) 57;
            case 23:
                yb9 yb9Var16 = sla.c;
                return (short) 58;
            case 26:
                yb9 yb9Var17 = sla.c;
                return (short) 59;
            case 27:
                yb9 yb9Var18 = sla.c;
                return (short) 77;
            case 28:
                yb9 yb9Var19 = sla.c;
                return (short) 86;
            case 29:
                yb9 yb9Var20 = sla.c;
                return (short) 68;
        }
    }

    @Override // defpackage.dle
    public boolean V() {
        switch (this.o) {
            case 7:
                return false;
            case 8:
                return false;
            case 9:
            case 10:
            default:
                return super.V();
            case 11:
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(int i, long j) {
        super((sla) null);
        this.o = 6;
        if (i != 0) {
            p("type", au1.d(i));
        }
        i(j, "sync");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(int i, String str, long j, int i2, String str2) {
        super((sla) null);
        this.o = 2;
        if (i == 0 && oag.t(str)) {
            throw new RuntimeException("Asset type or sectionId should be set");
        }
        if (i != 0) {
            p("type", au1.d(i));
        }
        if (!oag.t(str)) {
            p("sectionId", str);
        }
        i(j, "from");
        e(i2, NewHtcHomeBadger.COUNT);
        if (str2 != null) {
            p("query", str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(int i, long[] jArr) {
        super((sla) null);
        this.o = 1;
        if (i != 0) {
            if (jArr != null && jArr.length != 0) {
                p("type", au1.d(i));
                h("ids", jArr);
                return;
            }
            throw new IllegalArgumentException("ids must not be null or empty");
        }
        throw new IllegalArgumentException("type must not be null");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(long j, int i, List list, ek2 ek2Var, boolean z, int i2, int i3) {
        super((sla) null);
        this.o = 27;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        p("operation", wg0.c(i));
        g("userIds", list);
        p("type", ek2Var.a);
        if (i == 1) {
            d("showHistory", z);
        }
        if (i2 != 0) {
            e(i2, "cleanMsgPeriod");
        }
        if (i3 != 0) {
            e(i3, "permissions");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(long j, String str, long j2, int i, String str2) {
        super((sla) null);
        this.o = 26;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        if (!oag.t(str)) {
            p("type", str);
        }
        if (j2 != 0) {
            i(j2, "marker");
        }
        if (i > 0) {
            e(i, NewHtcHomeBadger.COUNT);
        }
        if (oag.t(str2)) {
            return;
        }
        p("query", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(String str) {
        super((sla) null);
        this.o = 22;
        if (oag.t(str)) {
            return;
        }
        p("link", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(String str, String str2) {
        super((sla) null);
        this.o = 29;
        p("query", str);
        e(50, NewHtcHomeBadger.COUNT);
        if (oag.t(str2)) {
            return;
        }
        p("marker", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(long j, Long l, Set set, Integer num, Integer num2) {
        super(sla.P0);
        this.o = 25;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        ((HashMap) this.b).put("messageId", l);
        if (set != null && !set.isEmpty()) {
            b10 b10Var = b10.UNKNOWN;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                switch (((b10) it.next()).ordinal()) {
                    case 2:
                        arrayList.add("PHOTO");
                        break;
                    case 3:
                        arrayList.add("VIDEO");
                        break;
                    case 4:
                        arrayList.add("AUDIO");
                        break;
                    case 6:
                        arrayList.add("SHARE");
                        break;
                    case 7:
                        arrayList.add("APP");
                        break;
                    case 8:
                        arrayList.add("CALL");
                        break;
                    case 9:
                        arrayList.add("FILE");
                        break;
                    case 10:
                        arrayList.add("CONTACT");
                        break;
                    case 11:
                        arrayList.add("PRESENT");
                        break;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        arrayList.add("INLINE_KEYBOARD");
                        break;
                    case 13:
                        arrayList.add("LOCATION");
                        break;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        arrayList.add("REPLY_KEYBOARD");
                        break;
                }
            }
            g("attachTypes", arrayList);
        }
        ((HashMap) this.b).put("forward", num);
        ((HashMap) this.b).put("backward", num2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(long j, long j2, int i, long j3, int i2, long j4, boolean z, boolean z2, String str, mg4 mg4Var) {
        super(sla.N0);
        this.o = 20;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        i(j2, "from");
        e(i, "forward");
        i(j3, "forwardTime");
        e(i2, "backward");
        i(j4, "backwardTime");
        d("getChat", z);
        d("getMessages", z2);
        if (str != null && str.length() != 0) {
            p("chatAccessToken", str);
        }
        p("itemType", mg4Var.name());
    }
}
