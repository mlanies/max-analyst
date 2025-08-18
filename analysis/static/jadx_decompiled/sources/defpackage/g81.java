package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes.dex */
public final /* synthetic */ class g81 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryPageScreen b;

    public /* synthetic */ g81(CallHistoryPageScreen callHistoryPageScreen, int i) {
        this.a = i;
        this.b = callHistoryPageScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i = 5;
        int i2 = 0;
        CallHistoryPageScreen callHistoryPageScreen = this.b;
        switch (this.a) {
            case 0:
                buc bucVar = CallHistoryPageScreen.u0;
                return new m81(callHistoryPageScreen.requireActivity().getApplicationContext(), callHistoryPageScreen.m0(), (rg1) callHistoryPageScreen.c.getValue());
            case 1:
                buc bucVar2 = CallHistoryPageScreen.u0;
                return new rg1(new khe(new g81(callHistoryPageScreen, i)), new l5g(callHistoryPageScreen, 0));
            case 2:
                buc bucVar3 = CallHistoryPageScreen.u0;
                if (callHistoryPageScreen.m0() != v81.o) {
                    return null;
                }
                aba abaVar = new aba(callHistoryPageScreen.getContext(), null);
                abaVar.setVisibility(8);
                abaVar.setId(pvb.call_history_page_empty);
                abaVar.setIcon(woc.f0);
                abaVar.setTitle(new eqe(c0c.call_history_missed_calls_empty_state_title));
                return abaVar;
            case 3:
                buc bucVar4 = CallHistoryPageScreen.u0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(callHistoryPageScreen.getContext(), null, 6);
                endlessRecyclerView2.setId(pvb.call_history_list);
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setAdapter((e81) callHistoryPageScreen.Z.getValue());
                callHistoryPageScreen.o = z7.m(endlessRecyclerView2);
                aba abaVar2 = (aba) callHistoryPageScreen.X.getValue();
                if (abaVar2 != null) {
                    endlessRecyclerView2.setEmptyView(abaVar2);
                }
                endlessRecyclerView2.setPager(new j81(callHistoryPageScreen, i2));
                endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
                endlessRecyclerView2.setThreshold(10);
                endlessRecyclerView2.setClipToPadding(false);
                float f = 0;
                float f2 = 10;
                endlessRecyclerView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                return endlessRecyclerView2;
            case 4:
                buc bucVar5 = CallHistoryPageScreen.u0;
                return new e81(new o9g(5, callHistoryPageScreen), jyc.a.p().c());
            default:
                buc bucVar6 = CallHistoryPageScreen.u0;
                return callHistoryPageScreen.getRouter();
        }
    }
}
