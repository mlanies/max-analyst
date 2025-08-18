package defpackage;

import android.widget.ImageView;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes.dex */
public final class tjf implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ tjf(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ImageView imageView = (ImageView) obj;
                imageView.setId(t8a.v);
                imageView.setImageResource(woc.g);
                tu0.K(imageView, 300L, new sjf(this.b, 0));
                break;
            default:
                ImageView imageView2 = (ImageView) obj;
                imageView2.setId(t8a.x);
                imageView2.setAlpha(0.0f);
                tu0.K(imageView2, 300L, new sjf(this.b, 1));
                break;
        }
        return e5f.a;
    }
}
