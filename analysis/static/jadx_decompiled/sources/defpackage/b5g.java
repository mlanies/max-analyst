package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final /* synthetic */ class b5g implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ b5g(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(Widget.viewBinding$lambda$7(widget, (View) obj));
            default:
                int i = vc7.a;
                Context context = widget.getContext();
                v6g v6gVar = ((x6g) obj).a;
                int i2 = v6gVar.f(8).d - v6gVar.f(7).d;
                if (vc7.c != i2) {
                    hm9.n(vc7.class.getName(), "insets changed keyboard height=" + i2);
                    if (vc7.b(i2)) {
                        String str = 1 == context.getResources().getConfiguration().orientation ? "pref_keyboard_height_portrait" : "pref_keyboard_height_landscape";
                        vc7.b.d(i2, str);
                        SharedPreferences sharedPreferences = vc7.d;
                        if (sharedPreferences == null) {
                            sharedPreferences = context.getApplicationContext().getSharedPreferences("keyboard_prefs", 0);
                        }
                        if (vc7.d == null) {
                            vc7.d = sharedPreferences;
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putInt(str, i2);
                        editorEdit.apply();
                    }
                    boolean zB = vc7.b(i2);
                    q0e q0eVar = vc7.e;
                    if (zB) {
                        q0eVar.m(null, Boolean.TRUE);
                    } else if (vc7.b(vc7.c)) {
                        q0eVar.m(null, Boolean.FALSE);
                    }
                    vc7.c = i2;
                }
                return e5f.a;
        }
    }
}
