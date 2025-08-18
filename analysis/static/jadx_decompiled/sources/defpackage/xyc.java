package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* loaded from: classes.dex */
public final class xyc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ SearchMessageBottomWidget Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyc(View view, SearchMessageBottomWidget searchMessageBottomWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = view;
        this.Z = searchMessageBottomWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        xyc xycVar = (xyc) n((tzc) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        xycVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xyc xycVar = new xyc(this.Y, this.Z, continuation);
        xycVar.X = obj;
        return xycVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        tzc tzcVar = (tzc) this.X;
        boolean z = tzcVar instanceof pzc;
        this.Y.setVisibility(z ? 0 : 8);
        if (!(tzcVar instanceof qzc) && !(tzcVar instanceof rzc)) {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            pzc pzcVar = (pzc) tzcVar;
            bc7[] bc7VarArr = SearchMessageBottomWidget.s0;
            SearchMessageBottomWidget searchMessageBottomWidget = this.Z;
            AppCompatTextView appCompatTextViewN0 = searchMessageBottomWidget.n0();
            Context context = searchMessageBottomWidget.getContext();
            int i = pzcVar.a;
            appCompatTextViewN0.setText(i == 0 ? context.getString(u8a.g) : context.getString(u8a.h, Integer.valueOf(pzcVar.b), Integer.valueOf(i)));
            boolean z2 = pzcVar.c;
            searchMessageBottomWidget.Y = z2;
            searchMessageBottomWidget.r0(searchMessageBottomWidget.p0(), z2);
            boolean z3 = pzcVar.d;
            searchMessageBottomWidget.Z = z3;
            searchMessageBottomWidget.r0(searchMessageBottomWidget.m0(), z3);
        }
        return e5f.a;
    }
}
