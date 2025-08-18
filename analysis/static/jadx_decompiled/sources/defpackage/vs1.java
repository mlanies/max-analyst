package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class vs1 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final khe e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j = tu0.r(3, new dk1(22));
    public final je7 k = tu0.r(3, new dk1(23));

    public vs1(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = je7Var4;
        this.b = je7Var5;
        this.c = je7Var3;
        this.d = je7Var2;
        this.e = new khe(new z30(3, je7Var2));
        this.f = tu0.r(3, new z30(4, je7Var));
        this.g = tu0.r(3, new z30(5, je7Var));
        this.h = tu0.r(3, new z30(6, je7Var));
        this.i = tu0.r(3, new z30(7, je7Var));
    }

    public static kua b(CharSequence charSequence, String str, Bitmap bitmap) {
        IconCompat iconCompat;
        if (!(!w9e.C0(charSequence))) {
            charSequence = w9e.C0(str) ^ true ? str : "...";
        }
        if (bitmap != null) {
            iconCompat = new IconCompat(5);
            iconCompat.b = bitmap;
        } else {
            iconCompat = null;
        }
        kua kuaVar = new kua();
        kuaVar.a = charSequence;
        kuaVar.b = iconCompat;
        kuaVar.c = null;
        kuaVar.d = null;
        kuaVar.e = false;
        kuaVar.f = true;
        return kuaVar;
    }

    public final void a() {
        hm9.n("CallsNotification", "cancel call notification");
        e().b.cancel(null, 239);
        e().b.cancel(null, 240);
    }

    public final Notification c(Context context, y21 y21Var, boolean z, boolean z2) {
        hm9.n("CallsNotification", "createTempNotification");
        CharSequence charSequence = y21Var.c;
        if (charSequence == null) {
            charSequence = (String) this.f.getValue();
        }
        String str = !z2 ? (String) this.i.getValue() : z ? (String) this.h.getValue() : (String) this.g.getValue();
        int iIntValue = z ? ((Number) this.k.getValue()).intValue() : ((Number) this.j.getValue()).intValue();
        ((bea) this.d.getValue()).m();
        ((p84) this.c.getValue()).getClass();
        bu9 bu9Var = new bu9(context, "ru.oneme.app.new.activeCalls");
        bu9Var.k = -1;
        bu9Var.v = "call";
        bu9Var.F.icon = iIntValue;
        bu9Var.e = bu9.c(charSequence);
        bu9Var.f = bu9.c(str);
        return bu9Var.b();
    }

    public final ya1 d() {
        return (ya1) this.b.getValue();
    }

    public final pv9 e() {
        return (pv9) this.e.getValue();
    }
}
