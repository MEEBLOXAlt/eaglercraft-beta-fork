package net.minecraft.src;

import net.lax1dude.eaglercraft.EaglerAdapter;

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class RenderZombieSimple extends RenderLiving {

	public RenderZombieSimple(ModelBase modelbase, float f, float f1) {
		super(modelbase, f * f1);
		scale = f1;
	}

	protected void preRenderScale(EntityZombieSimple entityzombiesimple, float f) {
		EaglerAdapter.glScalef(scale, scale, scale);
	}

	protected void preRenderCallback(EntityLiving entityliving, float f) {
		preRenderScale((EntityZombieSimple) entityliving, f);
	}

	private float scale;
}
