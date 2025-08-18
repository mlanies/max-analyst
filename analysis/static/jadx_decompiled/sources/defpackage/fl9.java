package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* loaded from: classes2.dex */
public final class fl9 extends v2 implements pl9 {
    public VideoView X;
    public final float[] o;

    public fl9(Context context, float[] fArr) {
        super(context);
        this.o = fArr;
        l(null, yyb.view_raw_video_player);
    }

    @Override // defpackage.pl9
    public final void a(int i, int i2) {
        this.X.d();
    }

    @Override // defpackage.pl9
    public final void b(slf slfVar) {
        this.X.a(slfVar);
    }

    @Override // defpackage.pl9
    public final void d(hkf hkfVar) {
    }

    @Override // defpackage.pl9
    public final BitmapDrawable e() {
        return this.X.getVideoScreenShot();
    }

    @Override // defpackage.v2
    public final void m() {
        float[] fArr = this.o;
        if (fArr != null) {
            ((RoundedRectFrameLayout) ((View) this.c)).setCornersRadii(fArr);
        }
        VideoView videoView = (VideoView) ((View) this.c).findViewById(xxb.view_raw_video_player__v_video);
        this.X = videoView;
        videoView.setOnClickListener(new e44(new xx5(18, this), 0));
        this.X.setOnLongClickListener(new zl0(6, this));
    }

    @Override // defpackage.v2
    public final void release() {
        this.X.b();
    }
}
