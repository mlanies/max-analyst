package ru.ok;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import defpackage.r2c;
import defpackage.wme;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/TamBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lwme;", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class TamBottomSheetDialogFragment extends BottomSheetDialogFragment implements wme {
    public final int C1;

    public TamBottomSheetDialogFragment(int i) {
        this.C1 = i;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final int g1() {
        return r2c.UiUtils_LightBottomSheetDialog;
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Dialog dialog = this.w1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(null);
        }
        return layoutInflater.inflate(this.C1, viewGroup, false);
    }
}
