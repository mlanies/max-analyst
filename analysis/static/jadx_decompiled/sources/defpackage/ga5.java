package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class ga5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ga5(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        hdc adapter;
        switch (this.a) {
            case 0:
                return ((ia5) this.c).a.findViewById(this.b);
            case 1:
                oo7 oo7Var = (oo7) this.c;
                Drawable drawable = oo7Var.a.getDrawable(this.b);
                drawable.setColorFilter(new PorterDuffColorFilter(oo7Var.b, PorterDuff.Mode.SRC_IN));
                return drawable;
            case 2:
                MessagesLayoutManager messagesLayoutManager = (MessagesLayoutManager) this.c;
                int i = this.b;
                View viewR = messagesLayoutManager.r(i);
                if (viewR != null) {
                    String str = messagesLayoutManager.F;
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        us7 us7Var = us7.X;
                        RecyclerView recyclerView = messagesLayoutManager.I;
                        ir6Var.d(us7Var, str, "LM scroll to inflated view after redraw by pos:" + i + ", curSize:" + ((recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? null : Integer.valueOf(adapter.j())), null);
                    }
                    messagesLayoutManager.v1(viewR, i);
                }
                messagesLayoutManager.H = false;
                return Boolean.FALSE;
            default:
                return new j29(this.b, (je7) this.c);
        }
    }

    public /* synthetic */ ga5(int i, je7 je7Var) {
        this.a = 3;
        this.b = i;
        this.c = je7Var;
    }
}
