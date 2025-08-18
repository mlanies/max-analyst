package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes.dex */
public final class vjf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoMessageWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjf(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.Y = videoMessageWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vjf vjfVar = (vjf) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vjfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vjf vjfVar = new vjf(continuation, this.Y);
        vjfVar.X = obj;
        return vjfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = (String) this.X;
        bc7[] bc7VarArr = VideoMessageWidget.y0;
        VideoMessageWidget videoMessageWidget = this.Y;
        videoMessageWidget.getClass();
        TextView textView = (TextView) videoMessageWidget.Y.T0(videoMessageWidget, VideoMessageWidget.y0[2]);
        textView.setVisibility(str != null ? 0 : 8);
        if (str != null) {
            textView.setText(str);
        }
        return e5f.a;
    }
}
