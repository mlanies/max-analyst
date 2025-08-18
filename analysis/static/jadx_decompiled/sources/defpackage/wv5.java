package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wv5 implements qv5 {
    public final List a;
    public final int b = uvb.oneme_folder_widget_section_view_type;
    public final long c = uvb.oneme_folder_widget_section_id;

    public wv5(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.ol7
    public final int l() {
        return this.b;
    }
}
