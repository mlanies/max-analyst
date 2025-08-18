package defpackage;

import android.os.Bundle;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class rb3 implements n3a {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb3 b;

    public /* synthetic */ rb3(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.n3a
    public final void a() {
        switch (this.a) {
            case 0:
                yb3 yb3Var = this.b;
                Bundle bundleC = ((mm) yb3Var.o.o).c("android:support:activity-result");
                if (bundleC != null) {
                    wb3 wb3Var = yb3Var.s0;
                    wb3Var.getClass();
                    ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            wb3Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = wb3Var.g;
                        if (bundle != null) {
                            bundle2.putAll(bundle);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            LinkedHashMap linkedHashMap = wb3Var.b;
                            boolean zContainsKey = linkedHashMap.containsKey(str);
                            LinkedHashMap linkedHashMap2 = wb3Var.a;
                            if (zContainsKey) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    f8.b(linkedHashMap2);
                                    linkedHashMap2.remove(num);
                                }
                            }
                            int iIntValue = integerArrayList.get(i).intValue();
                            String str2 = stringArrayList.get(i);
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str2);
                            linkedHashMap.put(str2, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                z06 z06Var = (z06) ((b) this.b).E0.a;
                z06Var.w0.b(z06Var, z06Var, null);
                break;
        }
    }
}
