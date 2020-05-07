module.export = {
	extends : '@Shutterstock/eslint-config',
	plugin: [
		'json',
	],

	rules: {
		'import/no-anonymoys-default-export' : [1, {
			"allowArray": true
		}]
		}
}
