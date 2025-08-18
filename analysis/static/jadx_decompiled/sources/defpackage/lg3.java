package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class lg3 {
    public final Bundle a;

    public lg3(jqe jqeVar, Bundle bundle, wuc wucVar) {
        Bundle bundle2 = new Bundle();
        this.a = bundle2;
        bundle2.putParcelable("title", jqeVar);
        bundle2.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        if (wucVar != null) {
            bundle2.putString("stat_screen", wucVar.name());
        }
    }

    public final void a(mg3... mg3VarArr) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        d63.X(parcelableArrayList, mg3VarArr);
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void b(int i, eqe eqeVar) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        parcelableArrayList.add(new mg3(i, eqeVar, 1, false));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void c(int i, eqe eqeVar) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        parcelableArrayList.add(new mg3(i, eqeVar, 2, false));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void d(int i, eqe eqeVar) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        parcelableArrayList.add(new mg3(i, eqeVar, 3, false));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final ConfirmationBottomSheet e() {
        return new ConfirmationBottomSheet(this.a);
    }

    public final void f(jqe jqeVar) {
        Bundle bundle = this.a;
        if (jqeVar == null) {
            bundle.remove("description");
        } else {
            bundle.putParcelable("description", jqeVar);
        }
    }
}
