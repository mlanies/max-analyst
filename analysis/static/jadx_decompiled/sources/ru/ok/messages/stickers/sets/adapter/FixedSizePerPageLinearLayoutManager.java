package ru.ok.messages.stickers.sets.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.pdc;

/* loaded from: classes2.dex */
public class FixedSizePerPageLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.a
    public final boolean g(pdc pdcVar) {
        if (pdcVar != null) {
            return ((ViewGroup.MarginLayoutParams) pdcVar).width == Math.round(((float) (this.p == 0 ? this.n : this.o)) / ((float) 0));
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final pdc s() {
        pdc pdcVarS = super.s();
        int iRound = Math.round((this.p == 0 ? this.n : this.o) / 0);
        if (this.p == 0) {
            ((ViewGroup.MarginLayoutParams) pdcVarS).width = iRound;
        } else {
            ((ViewGroup.MarginLayoutParams) pdcVarS).height = iRound;
        }
        return pdcVarS;
    }

    @Override // androidx.recyclerview.widget.a
    public final pdc u(ViewGroup.LayoutParams layoutParams) {
        pdc pdcVarU = super.u(layoutParams);
        int iRound = Math.round((this.p == 0 ? this.n : this.o) / 0);
        if (this.p == 0) {
            ((ViewGroup.MarginLayoutParams) pdcVarU).width = iRound;
        } else {
            ((ViewGroup.MarginLayoutParams) pdcVarU).height = iRound;
        }
        return pdcVarU;
    }
}
