package defpackage;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final class j68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ LinearLayout Y;
    public final /* synthetic */ MediaBarWidget Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j68(Continuation continuation, LinearLayout linearLayout, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = linearLayout;
        this.Z = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        j68 j68Var = (j68) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        j68Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        j68 j68Var = new j68(continuation, this.Y, this.Z);
        j68Var.X = obj;
        return j68Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        u4d u4dVar;
        od2.a0(obj);
        int i = ((Boolean) this.X).booleanValue() ? 0 : 8;
        LinearLayout linearLayout = this.Y;
        linearLayout.setVisibility(i);
        bc7[] bc7VarArr = MediaBarWidget.d1;
        MediaBarWidget mediaBarWidget = this.Z;
        mediaBarWidget.getClass();
        bc7[] bc7VarArr2 = MediaBarWidget.d1;
        bc7 bc7Var = bc7VarArr2[12];
        RecyclerView recyclerView = (RecyclerView) mediaBarWidget.I0.getValue();
        if (linearLayout.getVisibility() == 0) {
            bc7 bc7Var2 = bc7VarArr2[11];
            u4dVar = (u4d) mediaBarWidget.H0.getValue();
        } else {
            u4dVar = null;
        }
        recyclerView.setAdapter(u4dVar);
        return e5f.a;
    }
}
