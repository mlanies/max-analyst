package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class k7d {
    public static int a = 1;

    public static final void a(int i, View view, ViewGroup viewGroup) {
        int iS = au1.s(i);
        if (iS == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    view.toString();
                    viewGroup2.toString();
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iS == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iS == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (iS != 3) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "cv";
        }
        if (i == 2) {
            return "cn";
        }
        throw null;
    }

    public static /* synthetic */ int c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 20;
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "SYSTEM";
        }
        if (i == 3) {
            return "USER";
        }
        throw null;
    }

    public static int e(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int f(int i, int i2, jqe jqeVar) {
        return (jqeVar.hashCode() + i) * i2;
    }

    public static int g(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static bs6 h(pq9 pq9Var, Context context) {
        return pq9Var.b(context).i().getIcon();
    }

    public static cee i(ArrayList arrayList, cee ceeVar) {
        arrayList.add(ceeVar);
        return new cee();
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder k(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static EnumMap l(long j, EnumMap enumMap, du4 du4Var, Class cls) {
        enumMap.put((EnumMap) du4Var, (du4) new ck4(j));
        return new EnumMap(cls);
    }

    public static void m(int i, dee deeVar, long j, cee ceeVar) {
        ceeVar.a(new xb0(i, deeVar, j));
    }

    public static /* synthetic */ void n(ol7 ol7Var) {
        throw new ClassCastException();
    }

    public static void o(String str, String str2) {
        z04.c0(str + str2);
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "NONE" : "MUTED" : "TALKING";
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "USER" : "SYSTEM" : "UNKNOWN";
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "SET_SHOWCASE" : "SET" : "POPULAR" : "FAVORITE" : "RECENT";
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "LOTTIE" : "LIVE" : "STATIC" : "UNKNOWN";
    }

    public static /* synthetic */ String t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "BOT_COMMAND_DESCRIPTION" : "BOT_COMMAND" : "BOT_TAG" : "CONTACT";
    }
}
