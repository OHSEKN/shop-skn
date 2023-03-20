<template>

    <v-card outlined>
        <v-card-title>
            View # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Customerid" v-model="item.customerid" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Productid" v-model="item.productid" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Qty" v-model="item.qty" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Status" v-model="item.status" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'ViewViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/views/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

