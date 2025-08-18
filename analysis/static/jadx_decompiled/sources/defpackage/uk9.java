package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class uk9 extends v2 implements nse {
    public TextView X;
    public View Y;
    public boolean Z;
    public final tg o;

    public uk9(Context context, tg tgVar) {
        super(context);
        this.o = tgVar;
        l(null, yyb.view_floating_video_trash);
    }

    @Override // defpackage.nse
    public final void c() {
        if (!this.Z) {
            this.X.setTextColor(-1);
            return;
        }
        Context context = ((View) this.c).getContext();
        khe kheVar = sme.a0;
        this.X.setTextColor(fm9.R(context).k);
    }

    @Override // defpackage.v2
    public final void m() {
        this.X = (TextView) ((View) this.c).findViewById(xxb.view_floating_video_trash__tv_tip);
        this.Y = ((View) this.c).findViewById(xxb.view_floating_video_trash__v_background);
        c();
    }
}
