package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class y3a extends p66 implements c66 {
    public static final y3a a = new y3a(3, z3a.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z3a z3aVar = (z3a) obj;
        z3d z3dVar = (z3d) obj2;
        long j = z3aVar.a;
        e5f e5fVar = e5f.a;
        if (j <= 0) {
            ((y3d) z3dVar).X = e5fVar;
        } else {
            h76 h76Var = new h76(z3dVar, 15, z3aVar);
            y3d y3dVar = (y3d) z3dVar;
            lx3 lx3Var = y3dVar.a;
            y3dVar.c = j47.H(lx3Var).invokeOnTimeout(j, h76Var, lx3Var);
        }
        return e5fVar;
    }
}
