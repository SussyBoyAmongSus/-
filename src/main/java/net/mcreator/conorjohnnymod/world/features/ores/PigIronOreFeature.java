
package net.mcreator.conorjohnnymod.world.features.ores;

public class PigIronOreFeature extends OreFeature {

	public static PigIronOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new PigIronOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("conorjohnnymod:pig_iron_ore", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), ConorjohnnymodModBlocks.PIG_IRON_ORE.get().defaultBlockState())), 4));
		PLACED_FEATURE = PlacementUtils.register("conorjohnnymod:pig_iron_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(7), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(1), VerticalAnchor.absolute(43)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public PigIronOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
