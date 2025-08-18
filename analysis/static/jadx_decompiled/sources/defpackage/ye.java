package defpackage;

import android.graphics.Bitmap;
import com.facebook.animated.gif.GifImage;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* loaded from: classes.dex */
public final class ye implements lu6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ye(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lu6
    public final l43 a(g05 g05Var, int i, pqb pqbVar, ju6 ju6Var) {
        l43 l43VarA;
        switch (this.a) {
            case 0:
                AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.b;
                if (animatedFactoryV2Impl.e == null) {
                    animatedFactoryV2Impl.e = new df();
                }
                df dfVar = animatedFactoryV2Impl.e;
                Bitmap.Config config = ju6Var.b;
                dfVar.getClass();
                if (df.a == null) {
                    throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
                }
                o43 o43VarO = o43.o(g05Var.a);
                o43VarO.getClass();
                try {
                    qq8 qq8Var = (qq8) o43VarO.e0();
                    j43 j43VarA = df.a(g05Var.v0, ju6Var, qq8Var.r() != null ? GifImage.a(qq8Var.r(), ju6Var) : GifImage.b(qq8Var.n(), qq8Var.U(), ju6Var));
                    o43.S(o43VarO);
                    return j43VarA;
                } catch (Throwable th) {
                    o43.S(o43VarO);
                    throw th;
                }
            default:
                g05Var.o0();
                ou6 ou6Var = g05Var.c;
                ob4 ob4Var = (ob4) this.b;
                ob4Var.getClass();
                Boolean bool = Boolean.FALSE;
                ju6Var.getClass();
                if (ou6Var == qb4.a) {
                    o43 o43VarD = ob4Var.c.d(g05Var, ju6Var.a, i, null);
                    try {
                        o43VarD.getClass();
                        g05Var.o0();
                        int i2 = g05Var.o;
                        g05Var.o0();
                        CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(o43VarD, pqbVar, i2, g05Var.X);
                        closeableStaticBitmapOf.putExtra(HasExtraData.KEY_IS_ROUNDED, bool);
                        return closeableStaticBitmapOf;
                    } finally {
                        o43.S(o43VarD);
                    }
                }
                if (ou6Var == qb4.c) {
                    g05Var.o0();
                    if (g05Var.Y != -1) {
                        g05Var.o0();
                        if (g05Var.Z != -1) {
                            ju6Var.getClass();
                            lu6 lu6Var = ob4Var.a;
                            l43VarA = lu6Var != null ? lu6Var.a(g05Var, i, pqbVar, ju6Var) : ob4Var.b(g05Var, ju6Var);
                        }
                    }
                    throw new DecodeException("image width or height is incorrect", g05Var);
                }
                if (ou6Var != qb4.j) {
                    if (ou6Var == qb4.m) {
                        return null;
                    }
                    if (ou6Var != ou6.c) {
                        return ob4Var.b(g05Var, ju6Var);
                    }
                    throw new DecodeException("unknown image format", g05Var);
                }
                ju6Var.getClass();
                lu6 lu6Var2 = ob4Var.b;
                l43VarA = lu6Var2 != null ? lu6Var2.a(g05Var, i, pqbVar, ju6Var) : ob4Var.b(g05Var, ju6Var);
                return l43VarA;
        }
    }
}
