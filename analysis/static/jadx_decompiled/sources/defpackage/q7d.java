package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.devmenu.server.ServerHostBottomSheet;

/* loaded from: classes.dex */
public final class q7d extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ServerHostBottomSheet Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7d(Continuation continuation, ServerHostBottomSheet serverHostBottomSheet, View view) {
        super(2, continuation);
        this.Y = serverHostBottomSheet;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        q7d q7dVar = (q7d) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        q7dVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        q7d q7dVar = new q7d(continuation, this.Y, this.Z);
        q7dVar.X = obj;
        return q7dVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        mo6 mo6Var = (mo6) this.X;
        boolean z = mo6Var instanceof jo6;
        ServerHostBottomSheet serverHostBottomSheet = this.Y;
        if (z) {
            mr0.G(serverHostBottomSheet);
            serverHostBottomSheet.s0(true);
        } else {
            boolean z2 = mo6Var instanceof ko6;
            View view = this.Z;
            if (z2) {
                TransitionManager.beginDelayedTransition((ViewGroup) view, serverHostBottomSheet.z0);
                bc7[] bc7VarArr = ServerHostBottomSheet.G0;
                ((RecyclerView) serverHostBottomSheet.B0.T0(serverHostBottomSheet, bc7VarArr[0])).setVisibility(8);
                ((LinearLayout) serverHostBottomSheet.D0.T0(serverHostBottomSheet, bc7VarArr[2])).setVisibility(0);
                cka ckaVar = (cka) serverHostBottomSheet.E0.T0(serverHostBottomSheet, bc7VarArr[3]);
                String str = ((ko6) mo6Var).a;
                if (str == null) {
                    str = "";
                }
                ckaVar.setText(str);
            } else {
                if (!(mo6Var instanceof lo6)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransitionManager.beginDelayedTransition((ViewGroup) view, serverHostBottomSheet.z0);
                bc7[] bc7VarArr2 = ServerHostBottomSheet.G0;
                ((RecyclerView) serverHostBottomSheet.B0.T0(serverHostBottomSheet, bc7VarArr2[0])).setVisibility(8);
                ((LinearLayout) serverHostBottomSheet.D0.T0(serverHostBottomSheet, bc7VarArr2[2])).setVisibility(8);
                ((nfa) serverHostBottomSheet.C0.T0(serverHostBottomSheet, bc7VarArr2[1])).setVisibility(0);
            }
        }
        return e5f.a;
    }
}
