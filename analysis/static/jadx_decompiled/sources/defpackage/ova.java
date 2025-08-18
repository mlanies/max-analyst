package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ova implements Externalizable {
    public boolean B0;
    public boolean D0;
    public boolean F0;
    public boolean H0;
    public boolean J0;
    public boolean L0;
    public boolean N0;
    public boolean P0;
    public boolean R0;
    public boolean W0;
    public boolean X;
    public boolean Y0;
    public boolean Z;
    public boolean a;
    public boolean a1;
    public boolean c;
    public boolean c1;
    public boolean e1;
    public boolean k1;
    public boolean t0;
    public boolean v0;
    public boolean x0;
    public boolean z0;
    public pva b = null;
    public pva o = null;
    public pva Y = null;
    public pva s0 = null;
    public pva u0 = null;
    public pva w0 = null;
    public pva y0 = null;
    public pva A0 = null;
    public pva C0 = null;
    public pva E0 = null;
    public pva G0 = null;
    public pva I0 = null;
    public pva K0 = null;
    public pva M0 = null;
    public pva O0 = null;
    public pva Q0 = null;
    public pva S0 = null;
    public String T0 = "";
    public int U0 = 0;
    public String V0 = "";
    public String X0 = "";
    public String Z0 = "";
    public String b1 = "";
    public String d1 = "";
    public String f1 = "";
    public boolean g1 = false;
    public final ArrayList h1 = new ArrayList();
    public final ArrayList i1 = new ArrayList();
    public boolean j1 = false;
    public String l1 = "";
    public boolean m1 = false;

    public void a(String str) {
        this.T0 = str;
    }

    public void b(String str) {
        this.V0 = str;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            pva pvaVar = new pva();
            pvaVar.readExternal(objectInput);
            this.a = true;
            this.b = pvaVar;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar2 = new pva();
            pvaVar2.readExternal(objectInput);
            this.c = true;
            this.o = pvaVar2;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar3 = new pva();
            pvaVar3.readExternal(objectInput);
            this.X = true;
            this.Y = pvaVar3;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar4 = new pva();
            pvaVar4.readExternal(objectInput);
            this.Z = true;
            this.s0 = pvaVar4;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar5 = new pva();
            pvaVar5.readExternal(objectInput);
            this.t0 = true;
            this.u0 = pvaVar5;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar6 = new pva();
            pvaVar6.readExternal(objectInput);
            this.v0 = true;
            this.w0 = pvaVar6;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar7 = new pva();
            pvaVar7.readExternal(objectInput);
            this.x0 = true;
            this.y0 = pvaVar7;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar8 = new pva();
            pvaVar8.readExternal(objectInput);
            this.z0 = true;
            this.A0 = pvaVar8;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar9 = new pva();
            pvaVar9.readExternal(objectInput);
            this.B0 = true;
            this.C0 = pvaVar9;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar10 = new pva();
            pvaVar10.readExternal(objectInput);
            this.D0 = true;
            this.E0 = pvaVar10;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar11 = new pva();
            pvaVar11.readExternal(objectInput);
            this.F0 = true;
            this.G0 = pvaVar11;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar12 = new pva();
            pvaVar12.readExternal(objectInput);
            this.H0 = true;
            this.I0 = pvaVar12;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar13 = new pva();
            pvaVar13.readExternal(objectInput);
            this.J0 = true;
            this.K0 = pvaVar13;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar14 = new pva();
            pvaVar14.readExternal(objectInput);
            this.L0 = true;
            this.M0 = pvaVar14;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar15 = new pva();
            pvaVar15.readExternal(objectInput);
            this.N0 = true;
            this.O0 = pvaVar15;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar16 = new pva();
            pvaVar16.readExternal(objectInput);
            this.P0 = true;
            this.Q0 = pvaVar16;
        }
        if (objectInput.readBoolean()) {
            pva pvaVar17 = new pva();
            pvaVar17.readExternal(objectInput);
            this.R0 = true;
            this.S0 = pvaVar17;
        }
        a(objectInput.readUTF());
        this.U0 = objectInput.readInt();
        b(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.W0 = true;
            this.X0 = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.Y0 = true;
            this.Z0 = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.a1 = true;
            this.b1 = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.c1 = true;
            this.d1 = utf4;
        }
        if (objectInput.readBoolean()) {
            String utf5 = objectInput.readUTF();
            this.e1 = true;
            this.f1 = utf5;
        }
        this.g1 = objectInput.readBoolean();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            mva mvaVar = new mva();
            mvaVar.readExternal(objectInput);
            this.h1.add(mvaVar);
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            mva mvaVar2 = new mva();
            mvaVar2.readExternal(objectInput);
            this.i1.add(mvaVar2);
        }
        this.j1 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String utf6 = objectInput.readUTF();
            this.k1 = true;
            this.l1 = utf6;
        }
        this.m1 = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.a);
        if (this.a) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            this.o.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.X);
        if (this.X) {
            this.Y.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            this.s0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.t0);
        if (this.t0) {
            this.u0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.v0);
        if (this.v0) {
            this.w0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x0);
        if (this.x0) {
            this.y0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z0);
        if (this.z0) {
            this.A0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B0);
        if (this.B0) {
            this.C0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D0);
        if (this.D0) {
            this.E0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.F0);
        if (this.F0) {
            this.G0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.H0);
        if (this.H0) {
            this.I0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.J0);
        if (this.J0) {
            this.K0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.L0);
        if (this.L0) {
            this.M0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.N0);
        if (this.N0) {
            this.O0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.P0);
        if (this.P0) {
            this.Q0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.R0);
        if (this.R0) {
            this.S0.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.T0);
        objectOutput.writeInt(this.U0);
        objectOutput.writeUTF(this.V0);
        objectOutput.writeBoolean(this.W0);
        if (this.W0) {
            objectOutput.writeUTF(this.X0);
        }
        objectOutput.writeBoolean(this.Y0);
        if (this.Y0) {
            objectOutput.writeUTF(this.Z0);
        }
        objectOutput.writeBoolean(this.a1);
        if (this.a1) {
            objectOutput.writeUTF(this.b1);
        }
        objectOutput.writeBoolean(this.c1);
        if (this.c1) {
            objectOutput.writeUTF(this.d1);
        }
        objectOutput.writeBoolean(this.e1);
        if (this.e1) {
            objectOutput.writeUTF(this.f1);
        }
        objectOutput.writeBoolean(this.g1);
        ArrayList arrayList = this.h1;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((mva) arrayList.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.i1.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((mva) this.i1.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.j1);
        objectOutput.writeBoolean(this.k1);
        if (this.k1) {
            objectOutput.writeUTF(this.l1);
        }
        objectOutput.writeBoolean(this.m1);
    }
}
