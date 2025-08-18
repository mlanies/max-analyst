package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class v5d {
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final khe d;
    public final je7 e;
    public final fic f;
    public final fic g;

    public v5d(Context context, je7 je7Var, je7 je7Var2, je7 je7Var3, kqe kqeVar, int i) {
        this.a = context;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = new khe(new b29(i, 1));
        this.e = je7Var3;
        this.f = new fic(new lwa(24, this));
        this.g = new fic(new zja(kqeVar, 17, this));
    }

    public static /* synthetic */ Layout b(v5d v5dVar, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return v5dVar.a(0, str, z);
    }

    public final Layout a(int i, CharSequence charSequence, boolean z) {
        khe kheVar = this.d;
        Layout layout = (Layout) ((mw7) kheVar.getValue()).c(charSequence);
        if (layout != null) {
            return layout;
        }
        je7 je7Var = this.c;
        je7 je7Var2 = this.b;
        fic ficVar = this.g;
        if (!z) {
            Layout layoutA = ((fe7) je7Var2.getValue()).a(charSequence, (TextPaint) ficVar.getValue(), ((w6a) ((os0) je7Var.getValue())).a() - i, 1, false, TextUtils.TruncateAt.END);
            ((mw7) kheVar.getValue()).d(charSequence, layoutA);
            return layoutA;
        }
        Layout layoutG = i24.g(this.a, (fe7) je7Var2.getValue(), charSequence, ((w6a) ((os0) je7Var.getValue())).a() - i, (TextPaint) ficVar.getValue(), new w8c(6));
        ((mw7) kheVar.getValue()).d(charSequence, layoutG);
        return layoutG;
    }

    public final void c() {
        khe kheVar = this.d;
        if (kheVar.a()) {
            ((mw7) kheVar.getValue()).j(-1);
            this.f.reset();
            this.g.reset();
        }
    }

    public v5d(Context context, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this(context, je7Var, je7Var2, je7Var3, os2.i, 200);
    }
}
