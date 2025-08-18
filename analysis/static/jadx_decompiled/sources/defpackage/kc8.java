package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class kc8 extends tdc {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public kc8(Context context, e11 e11Var, e11 e11Var2) {
        this.a = 0;
        this.f = e11Var;
        this.g = e11Var2;
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = 50;
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, int i, int i2) {
        View viewR;
        MessageModel messageModelL;
        View viewR2;
        switch (this.a) {
            case 0:
                int i3 = this.b;
                int i4 = this.c;
                if (i2 > 0) {
                    int i5 = this.e + i2;
                    this.e = i5;
                    if (i5 >= i4 || i2 >= i3) {
                        ((k56) this.g).invoke();
                        this.e = 0;
                        this.d = 0;
                        return;
                    }
                    return;
                }
                if (i2 < 0) {
                    int i6 = this.d + i2;
                    this.d = i6;
                    if (Math.abs(i6) >= i4 || Math.abs(i2) >= i3) {
                        ((k56) this.f).invoke();
                        this.d = 0;
                        this.e = 0;
                        return;
                    }
                    return;
                }
                return;
            default:
                LinearLayoutManager linearLayoutManagerT = z7.t(recyclerView);
                if (linearLayoutManagerT == null) {
                    throw new IllegalStateException("Only linear layout manger supported");
                }
                this.b = linearLayoutManagerT.W0();
                int iY0 = linearLayoutManagerT.Y0();
                this.d = iY0;
                int i7 = this.b;
                if (i7 == -1 || iY0 == -1) {
                    return;
                }
                if (i7 < this.c && (viewR2 = linearLayoutManagerT.r(i7)) != null) {
                    viewR2.getLocalVisibleRect((Rect) this.f);
                    if (((Rect) this.f).height() >= viewR2.getMeasuredHeight() * 0.3f) {
                        this.c = this.b;
                    }
                }
                int i8 = this.d;
                if (i8 <= this.e || (viewR = linearLayoutManagerT.r(i8)) == null) {
                    return;
                }
                if (!viewR.getLocalVisibleRect((Rect) this.f) || ((Rect) this.f).height() < viewR.getMeasuredHeight() * 0.3f) {
                    this.d = linearLayoutManagerT.X0();
                }
                int i9 = this.d;
                boolean zI = false;
                if (i9 >= 0 && i9 < ((MessagesListWidget) this.g).A0.j() && (messageModelL = ((MessagesListWidget) this.g).A0.L(i9)) != null) {
                    String str = ((MessagesListWidget) this.g).a;
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.X, str, "Try change last read message from listener, pos:" + i9 + ", msg:" + messageModelL.m(), null);
                    }
                    zI = ((MessagesListWidget) this.g).x0().I(messageModelL);
                }
                if (zI) {
                    this.e = this.d;
                    return;
                }
                return;
        }
    }

    public kc8(MessagesListWidget messagesListWidget) {
        this.a = 1;
        this.g = messagesListWidget;
        this.f = new Rect();
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }
}
