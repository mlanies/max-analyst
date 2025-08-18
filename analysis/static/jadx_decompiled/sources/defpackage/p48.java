package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;

/* loaded from: classes.dex */
public final class p48 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MediaBarPermissionWidget Y;
    public final /* synthetic */ FrameLayout Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p48(MediaBarPermissionWidget mediaBarPermissionWidget, FrameLayout frameLayout, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaBarPermissionWidget;
        this.Z = frameLayout;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        p48 p48Var = (p48) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        p48Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p48 p48Var = new p48(this.Y, this.Z, continuation);
        p48Var.X = ((Boolean) obj).booleanValue();
        return p48Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        View rootView;
        od2.a0(obj);
        boolean z = this.X;
        MediaBarPermissionWidget mediaBarPermissionWidget = this.Y;
        if (z) {
            rootView = ((hv1) mediaBarPermissionWidget.o.getValue()).getRootView();
            tu0.K(rootView, 300L, new n48(mediaBarPermissionWidget, 2));
        } else {
            bc7[] bc7VarArr = MediaBarPermissionWidget.Z;
            mediaBarPermissionWidget.getClass();
            bc7 bc7Var = MediaBarPermissionWidget.Z[0];
            rootView = (LinearLayout) mediaBarPermissionWidget.c.getValue();
        }
        FrameLayout frameLayout = this.Z;
        frameLayout.removeAllViews();
        frameLayout.addView(rootView);
        return e5f.a;
    }
}
