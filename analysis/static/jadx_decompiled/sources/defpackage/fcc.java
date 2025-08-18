package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class fcc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordExitBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcc(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.Y = recordExitBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fcc fccVar = (fcc) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fccVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fcc fccVar = new fcc(continuation, this.Y);
        fccVar.X = obj;
        return fccVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        icc iccVar = (icc) this.X;
        bc7[] bc7VarArr = RecordExitBottomSheet.G0;
        RecordExitBottomSheet recordExitBottomSheet = this.Y;
        recordExitBottomSheet.F0().setText(iccVar.a.b(recordExitBottomSheet.getContext()));
        TextView textViewE0 = recordExitBottomSheet.E0();
        jqe jqeVar = iccVar.b;
        textViewE0.setText(jqeVar != null ? jqeVar.b(recordExitBottomSheet.getContext()) : null);
        recordExitBottomSheet.E0().setVisibility(jqeVar != null ? 0 : 8);
        CharSequence charSequenceB = iccVar.e.b(recordExitBottomSheet.getContext());
        recordExitBottomSheet.D0().setTitle(charSequenceB);
        recordExitBottomSheet.D0().setVisibility((charSequenceB == null || charSequenceB.length() == 0) ^ true ? 0 : 8);
        recordExitBottomSheet.A0().setVisibility(iccVar.f ? 0 : 8);
        OneMeButton oneMeButtonB0 = recordExitBottomSheet.B0();
        hcc hccVar = iccVar.c;
        oneMeButtonB0.setMode(hccVar.c);
        oneMeButtonB0.setText(hccVar.b.b(oneMeButtonB0.getContext()));
        tu0.K(oneMeButtonB0, 300L, new hq(recordExitBottomSheet, 5, iccVar));
        OneMeButton oneMeButtonC0 = recordExitBottomSheet.C0();
        hcc hccVar2 = iccVar.d;
        oneMeButtonC0.setMode(hccVar2.c);
        oneMeButtonC0.setText(hccVar2.b.b(oneMeButtonC0.getContext()));
        tu0.K(oneMeButtonC0, 300L, new e0d(12, recordExitBottomSheet));
        return e5f.a;
    }
}
