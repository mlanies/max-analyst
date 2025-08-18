package defpackage;

import android.view.View;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class n48 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPermissionWidget b;

    public /* synthetic */ n48(MediaBarPermissionWidget mediaBarPermissionWidget, int i) {
        this.a = i;
        this.b = mediaBarPermissionWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = MediaBarPermissionWidget.Z;
                mediaBarPermissionWidget.m0();
                break;
            case 1:
                bc7[] bc7VarArr2 = MediaBarPermissionWidget.Z;
                mediaBarPermissionWidget.m0();
                break;
            default:
                bc7[] bc7VarArr3 = MediaBarPermissionWidget.Z;
                mediaBarPermissionWidget.m0();
                break;
        }
    }
}
