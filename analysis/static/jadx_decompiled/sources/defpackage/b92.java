package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class b92 {
    public static final b92 h;
    public final long a;
    public final List b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    static {
        List listAsList = Arrays.asList(y82.a, y82.b, y82.c);
        a92 a92Var = new a92();
        a92Var.a = 0L;
        a92Var.c = 0L;
        a92Var.d = 0L;
        a92Var.b = listAsList;
        a92Var.f = 0L;
        a92Var.g = 0L;
        h = new b92(a92Var);
    }

    public b92(a92 a92Var) {
        this.a = a92Var.a;
        List list = a92Var.b;
        this.b = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.c = a92Var.c;
        this.d = a92Var.d;
        this.e = a92Var.e;
        this.f = a92Var.f;
        this.g = a92Var.g;
    }

    public final a92 a() {
        a92 a92Var = new a92();
        a92Var.a = this.a;
        a92Var.b = new ArrayList(this.b);
        a92Var.c = this.c;
        a92Var.d = this.d;
        a92Var.e = this.e;
        a92Var.f = this.f;
        a92Var.g = this.g;
        return a92Var;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("ChatSettings{dontDisturbUntil=");
        sb.append(this.a);
        sb.append(", options=");
        List list = this.b;
        if (list == null) {
            string = "[]";
        } else {
            g27 g27Var = new g27(8);
            StringBuilder sb2 = new StringBuilder();
            x53.l0(list, sb2, ",", "[", "]", -1, "...", g27Var);
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(", lastNotifMark=");
        sb.append(this.c);
        sb.append(", lastNotifMessageId=");
        sb.append(this.d);
        sb.append(", favoriteIndex=");
        sb.append(this.e);
        sb.append(", hideMyLiveLocationPanelBeforeTime=");
        sb.append(this.f);
        sb.append(", hideLiveLocationPanelBeforeTime=");
        return z7b.i(sb, this.g, '}');
    }
}
