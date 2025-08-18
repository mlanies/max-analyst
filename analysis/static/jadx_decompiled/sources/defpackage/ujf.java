package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes.dex */
public final class ujf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoMessageWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujf(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.Y = videoMessageWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ujf ujfVar = (ujf) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ujfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ujf ujfVar = new ujf(continuation, this.Y);
        ujfVar.X = obj;
        return ujfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        xgf xgfVar = (xgf) this.X;
        boolean z = xgfVar.b;
        VideoMessageWidget videoMessageWidget = this.Y;
        Drawable drawable = z ? (Drawable) videoMessageWidget.t0.getValue() : (Drawable) videoMessageWidget.u0.getValue();
        bc7[] bc7VarArr = VideoMessageWidget.y0;
        videoMessageWidget.getClass();
        bc7[] bc7VarArr2 = VideoMessageWidget.y0;
        bc7 bc7Var = bc7VarArr2[1];
        q7c q7cVar = videoMessageWidget.X;
        ((ImageView) q7cVar.T0(videoMessageWidget, bc7Var)).setImageDrawable(drawable);
        ViewPropertyAnimator viewPropertyAnimator = videoMessageWidget.v0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = ((ImageView) q7cVar.T0(videoMessageWidget, bc7VarArr2[1])).animate().alpha(xgfVar.a ? 1.0f : 0.0f).setDuration(200L).withEndAction(new h76(videoMessageWidget, 28, xgfVar));
        videoMessageWidget.v0 = viewPropertyAnimatorWithEndAction;
        if (viewPropertyAnimatorWithEndAction != null) {
            viewPropertyAnimatorWithEndAction.start();
        }
        return e5f.a;
    }
}
